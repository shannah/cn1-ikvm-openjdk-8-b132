package com.sun.tools.jdeps.resources;

public final class jdeps extends java.util.ListResourceBundle {
    protected final Object[][] getContents() {
        return new Object[][] {
            { "artifact.not.found", "not found" },
            { "err.dot.output.path", "invalid path: {0}" },
            { "err.internal.error", "internal error: {0} {1} {2}" },
            { "err.invalid.arg.for.option", "invalid argument for option: {0}" },
            { "err.missing.arg", "no value given for {0}" },
            { "err.option.after.class", "option must be specified before classes: {0}" },
            { "err.option.unsupported", "{0} not supported: {1}" },
            { "err.profiles.msg", "No profile information" },
            { "err.unknown.option", "unknown option: {0}" },
            { "error.prefix", "Error:" },
            { "main.opt.P", "  -P           -profile              Show profile or the file containing a package" },
            { "main.opt.R", "  -R           -recursive            Recursively traverse all dependencies" },
            { "main.opt.apionly", "  -apionly                           Restrict analysis to APIs i.e. dependences\n                                     from the signature of public and protected\n                                     members of public classes including field\n                                     type, method parameter types, returned type,\n                                     checked exception types etc" },
            { "main.opt.cp", "  -cp <path>   -classpath <path>     Specify where to find class files" },
            { "main.opt.depth", "  -depth=<depth>                     Specify the depth of the transitive\n                                     dependency analysis" },
            { "main.opt.dotoutput", "  -dotoutput <dir>                   Destination directory for DOT file output" },
            { "main.opt.e", "  -e <regex>   -regex <regex>        Finds dependences in packages matching pattern\n                                     (-p and -e are exclusive)" },
            { "main.opt.h", "  -h -?        -help                 Print this usage message" },
            { "main.opt.include", "  -include <regex>                   Restrict analysis to classes matching pattern\n                                     This option filters the list of classes to\n                                     be analyzed.  It can be used together with\n                                     -p and -e which apply pattern to the dependences" },
            { "main.opt.jdkinternals", "  -jdkinternals                      Finds class-level dependences on JDK internal APIs.\n                                     By default, it analyzes all classes on -classpath\n                                     and input files unless -include option is specified.\n                                     This option cannot be used with -p, -e and -s options.\n                                     WARNING: JDK internal APIs may not be accessible in\n                                     the next release." },
            { "main.opt.p", "  -p <pkgname> -package <pkgname>    Finds dependences in the given package\n                                     (may be given multiple times)" },
            { "main.opt.s", "  -s           -summary              Print dependency summary only" },
            { "main.opt.v", "  -v           -verbose              Print all class level dependencies\n  -verbose:package                   Print package-level dependencies excluding\n                                     dependencies within the same archive\n  -verbose:class                     Print class-level dependencies excluding\n                                     dependencies within the same archive" },
            { "main.opt.version", "  -version                           Version information" },
            { "main.usage", "Usage: {0} <options> <classes...>\nwhere <classes> can be a pathname to a .class file, a directory, a JAR file,\nor a fully-qualified class name.  Possible options include:" },
            { "main.usage.summary", "Usage: {0} <options> <classes...>\nuse -h, -? or --help for a list of possible options" },
            { "warn.invalid.arg", "Invalid classname or pathname not exist: {0}" },
            { "warn.prefix", "Warning:" },
            { "warn.split.package", "package {0} defined in {1} {2}" },
        };
    }
}
