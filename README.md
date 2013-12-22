om-starter
==========

Leiningen template for a server-backed Om application.

## Usage

`lein new om-starter your-project`

OR

`lein dev` to run `lein cljsbuild auto dev` and `lein ring server` in
parallel. Gotta save those terminals.

## Server

`lein ring server`

## Client

`lein cljsbuild {once,auto} dev`

## Om

At time of writing, Om is pre-alpha and not in Clojars. You'll need to
install it manually via [swannodette's](https://github.com/swannodette) [instructions](https://github.com/swannodette/om#using-it).
