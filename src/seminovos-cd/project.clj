(defproject seminovos-cd "0.1.0-SNAPSHOT"
            :description "FIXME: write description"
            :url "http://example.com/FIXME"
            :dependencies [[lambdacd "0.12.1"]
                           [ring-server "0.3.1"]
                           [org.clojure/clojure "1.7.0"]
                           [org.clojure/tools.logging "0.3.0"]
                           [org.slf4j/slf4j-api "1.7.5"]
                           [ch.qos.logback/logback-core "1.0.13"]
                           [ch.qos.logback/logback-classic "1.0.13"]
                           [lambdaui "0.1.0-SNAPSHOT"]
                           [http-kit "2.2.0"]]
            :profiles {:uberjar {:aot :all}}
            :main seminovos-cd.core)
