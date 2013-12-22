(ns {{name}}.core
    (:require-macros [cljs.core.async.macros :refer [go alt!]])
    (:require [goog.events :as events]
              [cljs.core.async :refer [put! <! >! chan timeout]]
              [om.core :as om :include-macros true]
              [om.dom :as dom :include-macros true]
              [cljs-http.client :as http]
              [{{name}}.utils :refer [guid]]))

(def app-state
  (atom {:things []}))

(defn {{name}}-app [app]
  (reify
    om/IRender
    (render [_ owner]
      (dom/div nil
               (dom/h1 nil "{{name}} is working!")))))

(om/root app-state {{name}}-app (.getElementById js/document "content"))
