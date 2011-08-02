(defproject quartz-clj "1.0.0-SNAPSHOT"

  :description          "helper library for using quartz in clojure"

  :dependencies         [[org.clojure/clojure "1.2.1"]
                         [org.clojure/clojure-contrib "1.2.0"]
                         [org.quartz-scheduler/quartz "1.8.4"]]

  :dev-dependencies     [[swank-clojure "1.2.1"]
                         [log4j "1.2.15" :exclusions [javax.mail/mail javax.jms/jms com.sun.jdmk/jmxtools com.sun.jmx/jmxri]]
                         [org.slf4j/slf4j-log4j12 "1.6.1"]]

  :dev-resources        "dev-resources/")
