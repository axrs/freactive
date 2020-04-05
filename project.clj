(defproject io.axrs/freactive "0.2.0-SNAPSHOT"
  :description "High-performance, pure Clojurescript, declarative DOM library. Forked from https://github.com/aaronc/freactive"
  :url "https://github.com/aaronc/freactive"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[garden "1.3.9"]
                 [io.axrs/freactive.core "0.2.2-SNAPSHOT"]]
  :profiles
  {:dev {:dependencies [[org.clojure/clojure "1.10.1"]
                        [org.clojure/clojurescript "1.10.597"]
                        [org.clojure/core.async "1.1.587"]]}}
  :source-paths ["src"]
  :test-paths ["test"])
