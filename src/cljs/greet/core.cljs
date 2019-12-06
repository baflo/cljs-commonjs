(ns greet.core
  (:require [cljs.nodejs :as node]))

(println "test")

(def path (node/require "path"))
(def greet (node/require (greet.core.path/join (.cwd node/process) "src/js/greet")))

(node/enable-util-print!)
(greet.core.greet/greet)
