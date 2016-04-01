package sun.tools.jar.resources;

import java.util.ListResourceBundle;

public final class jar_zh_HK extends ListResourceBundle {
    protected final Object[][] getContents() {
        return new Object[][] {
            { "error.bad.cflag", "'c' \u65D7\u6A19\u8981\u6C42\u6307\u5B9A\u8CC7\u8A0A\u6E05\u55AE\u6216\u8F38\u5165\u6A94\u6848\uFF01" },
            { "error.bad.eflag", "\u7121\u6CD5\u540C\u6642\u6307\u5B9A 'e' \u65D7\u6A19\u548C\u5177\u6709 'Main-Class' \u5C6C\u6027\u7684\n\u8CC7\u8A0A\u6E05\u55AE\uFF01" },
            { "error.bad.option", "\u5176\u4E2D\u4E00\u500B\u9078\u9805 -{ctxu} \u5FC5\u9808\u52A0\u4EE5\u6307\u5B9A\u3002" },
            { "error.bad.uflag", "'u' \u65D7\u6A19\u8981\u6C42\u6307\u5B9A\u8CC7\u8A0A\u6E05\u55AE\u3001'e' \u65D7\u6A19\u6216\u8F38\u5165\u6A94\u6848\uFF01" },
            { "error.cant.open", "\u7121\u6CD5\u958B\u555F: {0} " },
            { "error.create.dir", "{0} : \u7121\u6CD5\u5EFA\u7ACB\u76EE\u9304" },
            { "error.create.tempfile", "\u7121\u6CD5\u5EFA\u7ACB\u66AB\u5B58\u6A94\u6848" },
            { "error.illegal.option", "\u7121\u6548\u7684\u9078\u9805: {0}" },
            { "error.incorrect.length", "\u8655\u7406 {0} \u6642\u9577\u5EA6\u4E0D\u6B63\u78BA" },
            { "error.nosuch.fileordir", "{0} : \u6C92\u6709\u9019\u985E\u6A94\u6848\u6216\u76EE\u9304" },
            { "error.write.file", "\u5BEB\u5165\u73FE\u6709\u7684 jar \u6A94\u6848\u6642\u767C\u751F\u932F\u8AA4" },
            { "out.added.manifest", "\u5DF2\u65B0\u589E\u8CC7\u8A0A\u6E05\u55AE" },
            { "out.adding", "\u65B0\u589E: {0}" },
            { "out.create", "  \u5EFA\u7ACB: {0}" },
            { "out.deflated", "(\u58D3\u7E2E {0}%)" },
            { "out.extracted", "\u64F7\u53D6: {0}" },
            { "out.ignore.entry", "\u5FFD\u7565\u9805\u76EE {0}" },
            { "out.inflated", " \u64F4\u5C55: {0}" },
            { "out.size", " (\u8B80={0})(\u5BEB={1})" },
            { "out.stored", "(\u5132\u5B58 0%)" },
            { "out.update.manifest", "\u5DF2\u66F4\u65B0\u8CC7\u8A0A\u6E05\u55AE" },
            { "usage", "\u7528\u6CD5: jar {ctxui}[vfmn0Me] [jar-file] [manifest-file] [entry-point] [-C dir] \u6A94\u6848 ...\n\u9078\u9805:\n    -c  \u5EFA\u7ACB\u65B0\u7684\u6B78\u6A94\n    -t  \u5217\u51FA\u6B78\u6A94\u7684\u76EE\u9304\n    -x  \u5F9E\u6B78\u6A94\u4E2D\u64F7\u53D6\u5DF2\u547D\u540D\u7684 (\u6216\u6240\u6709) \u6A94\u6848\n    -u  \u66F4\u65B0\u73FE\u6709\u6B78\u6A94\n    -v  \u5728\u6A19\u6E96\u8F38\u51FA\u4E2D\u7522\u751F\u8A73\u7D30\u8F38\u51FA\n    -f  \u6307\u5B9A\u6B78\u6A94\u6A94\u6848\u540D\u7A31\n    -m  \u5305\u542B\u6307\u5B9A\u8CC7\u8A0A\u6E05\u55AE\u4E2D\u7684\u8CC7\u8A0A\u6E05\u55AE\u8CC7\u8A0A\n    -n  \u5728\u5EFA\u7ACB\u65B0\u6B78\u6A94\u4E4B\u5F8C\u57F7\u884C Pack200 \u6B63\u898F\u5316\n    -e  \u70BA\u5DF2\u96A8\u9644\u65BC\u53EF\u57F7\u884C jar \u6A94\u6848\u4E2D\u7684\u7368\u7ACB\u61C9\u7528\u7A0B\u5F0F\n        \u6307\u5B9A\u61C9\u7528\u7A0B\u5F0F\u9032\u5165\u9EDE\n    -0  \u50C5\u5132\u5B58; \u4E0D\u4F7F\u7528 ZIP \u58D3\u7E2E\u65B9\u5F0F\n    -M  \u4E0D\u70BA\u9805\u76EE\u5EFA\u7ACB\u8CC7\u8A0A\u6E05\u55AE\u6A94\u6848\n    -i  \u70BA\u6307\u5B9A\u7684 jar \u6A94\u6848\u7522\u751F\u7D22\u5F15\u8CC7\u8A0A\n    -C  \u8B8A\u66F4\u81F3\u6307\u5B9A\u76EE\u9304\u4E26\u5305\u542B\u5F8C\u9762\u6240\u5217\u7684\u6A94\u6848\n\u5982\u679C\u6709\u4EFB\u4F55\u6A94\u6848\u662F\u76EE\u9304\uFF0C\u5247\u6703\u5C0D\u5176\u9032\u884C\u905E\u8FF4\u8655\u7406\u3002\n\u6E05\u55AE\u6A94\u6848\u540D\u7A31\u3001\u6B78\u6A94\u6A94\u6848\u540D\u7A31\u548C\u9032\u5165\u9EDE\u540D\u7A31\n\u7684\u6307\u5B9A\u9806\u5E8F\u8207\u6307\u5B9A 'm' \u65D7\u6A19\u3001'f' \u65D7\u6A19\u548C 'e' \u65D7\u6A19\u7684\u9806\u5E8F\u76F8\u540C\u3002\n\n\u7BC4\u4F8B 1: \u5C07\u5169\u500B\u985E\u5225\u6A94\u6848\u6B78\u6A94\u81F3\u540D\u70BA classes.jar \u7684\u6B78\u6A94\u4E2D: \n       jar cvf classes.jar Foo.class Bar.class\n\u7BC4\u4F8B 2: \u4F7F\u7528\u73FE\u6709\u8CC7\u8A0A\u6E05\u55AE\u6A94\u6848 'mymanifest' \u4E26\u5C07\n           foo/ \u76EE\u9304\u4E2D\u7684\u6240\u6709\u6A94\u6848\u6B78\u6A94\u81F3 'classes.jar' \u4E2D: \n       jar cvfm classes.jar mymanifest -C foo/ .\n" },
        };
    }
}
