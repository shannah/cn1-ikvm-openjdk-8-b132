package sun.launcher.resources;

import java.util.ListResourceBundle;

public final class launcher_pt_BR extends ListResourceBundle {
    protected final Object[][] getContents() {
        return new Object[][] {
            { "java.launcher.X.macosx.usage", "\nAs op\u00E7\u00F5es a seguir s\u00E3o espec\u00EDficas para o Mac OS X:\n    -XstartOnFirstThread\n                      executa o m\u00E9todo main() no primeiro thread (AppKit)\n    -Xdock:name=<nome da aplica\u00E7\u00E3o>\"\n                      substitui o nome da aplica\u00E7\u00E3o default exibido no encaixe\n    -Xdock:icon=<caminho para o arquivo do \u00EDcone>\n                      substitui o \u00EDcone exibido no encaixe\n\n" },
            { "java.launcher.X.usage", "    -Xmixed           execu\u00E7\u00E3o no modo misto (default)\n    -Xint             execu\u00E7\u00E3o somente no modo interpretado\n    -Xbootclasspath:<diret\u00F3rios e arquivos zip/jar separados por {0}>\n                      define o caminho de pesquisa para classes e recursos de inicializa\u00E7\u00E3o\n    -Xbootclasspath/a:<diret\u00F3rios e arquivos zip/jar separados por {0}>\n                      anexa no final do caminho da classe de inicializa\u00E7\u00E3o\n    -Xbootclasspath/p:<diret\u00F3rios e arquivos zip/jar separados por {0}>\n                      anexa no in\u00EDcio do caminho da classe de inicializa\u00E7\u00E3o\n    -Xdiag            mostra mensagens de diagn\u00F3stico adicionais\n    -Xnoclassgc       desativa a coleta de lixo da classe\n    -Xincgc           ativa a coleta de lixo incremental\n    -Xloggc:<arquivo>    registra o status do GC status em um arquivo com marca\u00E7\u00F5es de data e hor\u00E1rio\n    -Xbatch           desativa a compila\u00E7\u00E3o em segundo plano\n    -Xms<tamanho>        define o tamanho inicial do heap Java\n    -Xmx<tamanho>        define o tamanho m\u00E1ximo do heap Java\n    -Xss<tamanho>        define o tamanho da pilha de threads java\n    -Xprof            produz dados de perfil da cpu\n    -Xfuture          ativa verifica\u00E7\u00F5es de n\u00EDvel m\u00E1ximo de exig\u00EAncia, prevendo o valor default futuro\n    -Xrs              reduz o uso de sinais do SO pelo(a) Java/VM (consulte a documenta\u00E7\u00E3o)\n    -Xcheck:jni       executa verifica\u00E7\u00F5es adicionais de fun\u00E7\u00F5es da JNI\n    -Xshare:off       n\u00E3o tenta usar dados da classe compartilhada\n    -Xshare:auto      se poss\u00EDvel, usa dados da classe compartilhada (default)\n    -Xshare:on        requer o uso de dados da classe compartilhada, caso contr\u00E1rio haver\u00E1 falha.\n    -XshowSettings    mostra todas as defini\u00E7\u00F5es e continua\n    -XshowSettings:all\n                      mostra todas as defini\u00E7\u00F5es e continua\n    -XshowSettings:vm mostra todas as defini\u00E7\u00F5es relacionadas \u00E0 vm e continua\n    -XshowSettings:properties\n                      mostra todas as defini\u00E7\u00F5es da propriedade e continua\n    -XshowSettings:locale\n                      mostra todas as defini\u00E7\u00F5es relativas \u00E0s configura\u00E7\u00F5es regionais e continua\n\nAs -X options n\u00E3o s\u00E3o padronizadas e est\u00E3o sujeitas a altera\u00E7\u00F5es sem aviso.\n" },
            { "java.launcher.cls.error1", "Erro: N\u00E3o foi poss\u00EDvel localizar nem carregar a classe principal {0}" },
            { "java.launcher.cls.error2", "Erro: o m\u00E9todo main n\u00E3o \u00E9 {0} na classe {1}; defina o m\u00E9todo main como:\n   public static void main(String[] args)" },
            { "java.launcher.cls.error3", "Erro: o m\u00E9todo main deve retornar um valor do tipo void na classe {0}; \ndefina o m\u00E9todo main como:\n   public static void main(String[] args)" },
            { "java.launcher.cls.error4", "Erro: o m\u00E9todo main n\u00E3o foi encontrado na classe {0}; defina o m\u00E9todo main como:\\n   public static void main(String[] args)\\nou uma classe da aplica\u00E7\u00E3o JavaFX deve expandir {1}" },
            { "java.launcher.cls.error5", "Erro: os componentes de runtime do JavaFX n\u00E3o foram encontrados. Eles s\u00E3o obrigat\u00F3rios para executar esta aplica\u00E7\u00E3o" },
            { "java.launcher.ergo.message1", "                  A VM default \u00E9 {0}" },
            { "java.launcher.ergo.message2", "                  porque a execu\u00E7\u00E3o est\u00E1 sendo feita em uma m\u00E1quina de classe de servidor.\n" },
            { "java.launcher.init.error", "erro de inicializa\u00E7\u00E3o" },
            { "java.launcher.jar.error1", "Erro: ocorreu um erro inesperado ao tentar abrir o arquivo {0}" },
            { "java.launcher.jar.error2", "manifesto n\u00E3o encontrado em {0}" },
            { "java.launcher.jar.error3", "nenhum atributo de manifesto principal em {0}" },
            { "java.launcher.javafx.error1", "Erro: O m\u00E9todo launchApplication do JavaFX tem a assinatura errada. Ele\\ndeve ser declarado como est\u00E1tico e retornar um valor do tipo void" },
            { "java.launcher.opt.datamodel", "    -d{0}\t  usar um modelo de dados de {0} bits, se estiver dispon\u00EDvel\n" },
            { "java.launcher.opt.footer", "    -cp <caminho de pesquisa da classe dos diret\u00F3rios e arquivos zip/jar>\n    -classpath <caminho de pesquisa da classe dos diret\u00F3rios e arquivos zip/jar>\n                  Uma lista separada por {0} de diret\u00F3rios, archives JAR\n                  e archives ZIP nos quais ser\u00E3o procurados os arquivos de classe.\n    -D<nome>=<valor>\n                  define uma propriedade do sistema\n    -verbose:[class|gc|jni]\n                  ativa a sa\u00EDda detalhada\n    -version      imprime a vers\u00E3o do produto e sai do programa\n    -version:<valor>\n                  requer a execu\u00E7\u00E3o da vers\u00E3o especificada\n    -showversion  imprime a vers\u00E3o do produto e continua\n    -jre-restrict-search | -no-jre-restrict-search\n                  inclui/exclui JREs privados do usu\u00E1rio na pesquisa de vers\u00E3o\n    -? -help      imprime esta mensagem de ajuda\n    -X            imprime a ajuda sobre op\u00E7\u00F5es n\u00E3o padronizadas\n    -ea[:<nome do pacote>...|:<nome da classe>]\n    -enableassertions[:<nome do pacote>...|:<nome da classe>]\n                  ativa asser\u00E7\u00F5es com granularidade especificada\n    -da[:<nome do pacote>...|:<nome da classe>]\n    -disableassertions[:<nome do pacote>...|:<nome da classe>]\n                  desativa asser\u00E7\u00F5es com granularidade especificada\n    -esa | -enablesystemassertions\n                  ativa asser\u00E7\u00F5es do sistema\n    -dsa | -disablesystemassertions\n                  desativa asser\u00E7\u00F5es do sistema\n    -agentlib:<nome da biblioteca>[=<op\u00E7\u00F5es>]\n                  carrega a biblioteca de agentes nativa <nome da biblioteca>, por exemplo: -agentlib:hprof\n                  consulte tamb\u00E9m: -agentlib:jdwp=help e -agentlib:hprof=help\n    -agentpath:<nome do caminho>[=<op\u00E7\u00F5es>]\n                  carrega a biblioteca de agentes nativa com base no nome do caminho completo\n    -javaagent:<caminho do arquivo jar>[=<op\u00E7\u00F5es>]\n                  carrega o agente da linguagem de programa\u00E7\u00E3o Java; consulte java.lang.instrument\n    -splash:<caminho da imagem>\n                  mostra a tela de abertura com a imagem especificada\nConsulte http://www.oracle.com/technetwork/java/javase/documentation/index.html para obter mais detalhes." },
            { "java.launcher.opt.header", "Uso: {0} [-options] class [args...]\n           (para executar uma classe)\n   ou  {0} [-options] -jar jarfile [args...]\n           (para executar um arquivo jar)\nem que as op\u00E7\u00F5es incluem:\n" },
            { "java.launcher.opt.hotspot", "    {0}\t  \u00E9 um sin\u00F4nimo da VM \"{1}\" [obsoleto]\n" },
            { "java.launcher.opt.vmselect", "    {0}\t  para selecionar a VM \"{1}\"\n" },
        };
    }
}
