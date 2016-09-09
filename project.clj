(defproject event-data-status-service "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [clj-time "0.12.0"]
                 [compojure "1.5.1"]
                 [http-kit "2.1.18"]
                 [http-kit.fake "0.2.1"]
                 [liberator "0.14.1"]
                 [org.clojure/core.async "0.2.385"]
                 [org.clojure/data.json "0.2.6"]
                 [overtone/at-at "1.2.0"]
                 [redis.clients/jedis "2.8.0"]
                 [ring "1.5.0"]
                 [ring/ring-jetty-adapter "1.5.0"]
                 [ring/ring-servlet "1.5.0"]
                 [robert/bruce "0.8.0"]
                 [yogthos/config "0.8"]]
  :main ^:skip-aot event-data-status-service.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}
             :prod {:resource-paths ["config/prod"]}
             :dev  {:resource-paths ["config/dev"]}})
