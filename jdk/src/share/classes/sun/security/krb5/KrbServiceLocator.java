/*
 * Copyright (c) 2006, 2011, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

package sun.security.krb5;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.Random;
import java.util.StringTokenizer;

import javax.naming.*;
import javax.naming.directory.*;
import javax.naming.spi.NamingManager;

/**
 * This class discovers the location of Kerberos services by querying DNS,
 * as defined in RFC 4120.
 *
 * @author Seema Malkani
 * @since 1.7
 */

class KrbServiceLocator {

    private static final String SRV_RR = "SRV";
    private static final String[] SRV_RR_ATTR = new String[] {SRV_RR};

    private static final String SRV_TXT = "TXT";
    private static final String[] SRV_TXT_ATTR = new String[] {SRV_TXT};

    private static final Random random = new Random();

    private KrbServiceLocator() {
    }

    /**
     * Locates the KERBEROS service for a given domain.
     * Queries DNS for a list of KERBEROS Service Text Records (TXT) for a
     * given domain name.
     * Information on the mapping of DNS hostnames and domain names
     * to Kerberos realms is stored using DNS TXT records
     *
     * @param domainName A string domain name.
     * @param environment The possibly null environment of the context.
     * @return An ordered list of hostports for the Kerberos service or null if
     *          the service has not been located.
     */
    static String[] getKerberosService(String realmName) {
        return null;
    }

    /**
     * Locates the KERBEROS service for a given domain.
     * Queries DNS for a list of KERBEROS Service Location Records (SRV) for a
     * given domain name.
     *
     * @param domainName A string domain name.
     * @return An ordered list of hostports for the Kerberos service or null if
     *          the service has not been located.
     */
    static String[] getKerberosService(String realmName, String protocol) {
        return null;
    }

    /**
     * Extract hosts and port numbers from a list of SRV records.
     * An array of hostports is returned or null if none were found.
     */
    private static String[] extractHostports(SrvRecord[] srvRecords) {
        String[] hostports = null;

        int head = 0;
        int tail = 0;
        int sublistLength = 0;
        int k = 0;
        for (int i = 0; i < srvRecords.length; i++) {
            if (hostports == null) {
                hostports = new String[srvRecords.length];
            }
            // find the head and tail of the list of records having the same
            // priority value.
            head = i;
            while (i < srvRecords.length - 1 &&
                srvRecords[i].priority == srvRecords[i + 1].priority) {
                i++;
            }
            tail = i;

            // select hostports from the sublist
            sublistLength = (tail - head) + 1;
            for (int j = 0; j < sublistLength; j++) {
                hostports[k++] = selectHostport(srvRecords, head, tail);
            }
        }
        return hostports;
    }

    /*
     * Randomly select a service record in the range [head, tail] and return
     * its hostport value. Follows the algorithm in RFC 2782.
     */
    private static String selectHostport(SrvRecord[] srvRecords, int head,
            int tail) {
        if (head == tail) {
            return srvRecords[head].hostport;
        }

        // compute the running sum for records between head and tail
        int sum = 0;
        for (int i = head; i <= tail; i++) {
            if (srvRecords[i] != null) {
                sum += srvRecords[i].weight;
                srvRecords[i].sum = sum;
            }
        }
        String hostport = null;

        // If all records have zero weight, select first available one;
        // otherwise, randomly select a record according to its weight
        int target = (sum == 0 ? 0 : random.nextInt(sum + 1));
        for (int i = head; i <= tail; i++) {
            if (srvRecords[i] != null && srvRecords[i].sum >= target) {
                hostport = srvRecords[i].hostport;
                srvRecords[i] = null; // make this record unavailable
                break;
            }
        }
        return hostport;
    }

/**
 * This class holds a DNS service (SRV) record.
 * See http://www.ietf.org/rfc/rfc2782.txt
 */

static class SrvRecord implements Comparable<SrvRecord> {

    int priority;
    int weight;
    int sum;
    String hostport;

    /**
     * Creates a service record object from a string record.
     * DNS supplies the string record in the following format:
     * <pre>
     *          <Priority> " " <Weight> " " <Port> " " <Host>
     * </pre>
     */
    SrvRecord(String srvRecord) throws Exception {
        StringTokenizer tokenizer = new StringTokenizer(srvRecord, " ");
        String port;

        if (tokenizer.countTokens() == 4) {
            priority = Integer.parseInt(tokenizer.nextToken());
            weight = Integer.parseInt(tokenizer.nextToken());
            port = tokenizer.nextToken();
            hostport = tokenizer.nextToken() + ":" + port;
        } else {
            throw new IllegalArgumentException();
        }
    }

    /*
     * Sort records in ascending order of priority value. For records with
     * equal priority move those with weight 0 to the top of the list.
     */
    public int compareTo(SrvRecord that) {
        if (priority > that.priority) {
            return 1; // this > that
        } else if (priority < that.priority) {
            return -1; // this < that
        } else if (weight == 0 && that.weight != 0) {
            return -1; // this < that
        } else if (weight != 0 && that.weight == 0) {
            return 1; // this > that
        } else {
            return 0; // this == that
        }
    }
}
}
