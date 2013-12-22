(ns leiningen.new.om-starter
  (:require [leiningen.new.templates :refer [renderer name-to-path ->files]]))

(def render (renderer "om-starter"))

(defn om-starter [name]
  (let [data {:name name
              :sanitized (name-to-path name)}]
    (->files data
      ["project.clj" (render "project.clj" data)]
      ["src/cljs/{{sanitized}}/core.cljs" (render "core.cljs" data)]
      ["src/cljs/{{sanitized}}/utils.cljs" (render "utils.cljs" data)]
      ["src/clj/{{sanitized}}/core.clj" (render "core.clj" data)]
      ["resources/public/index.html" (render "index.html" data)])))
