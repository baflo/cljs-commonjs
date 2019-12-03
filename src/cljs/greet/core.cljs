(ns greet.core
  (:require [cljs.nodejs :as nodejs]
            [js.greet :refer [greet]]))

(nodejs/enable-util-print!)
(greet)
