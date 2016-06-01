(defproject galois "1.0.0-SNAPSHOT"
  :description "Group theory meets APIs"
  :url "https://github.com/bcrisp/galois"
  :license {:name "Eclipse Public License v1.0"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
            		 [org.clojure/tools.trace "0.7.9"]
                 [ring/ring-jetty-adapter "1.4.0"]
                 [ring/ring-mock "0.3.0"]
                 [environ "1.0.0"]]
  :min-lein-version "2.0.0"
  :plugins [[environ/environ.lein "0.3.1"]]
  :hooks [environ.leiningen.hooks]
  :uberjar-name "galois-standalone.jar"
  :main galois.group
  :profiles {:production {:env {:production true}}})
