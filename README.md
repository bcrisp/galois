# Galois

[![Build Status](https://travis-ci.org/bcrisp/galois.svg?branch=master)](https://travis-ci.org/bcrisp/galois)

## REST APIs map to algebraic structures

A REST API maps particular resources in a consistent URL format.

## What is a REST API?

REST stands for REpresentational State Transfer, a way of mapping state from client to server.

A major point of REST is HATEOAS (Hypertext As Engine of Application State), which is to say that the responses received from the server map to a particular application state the server currently resides in.

Instead of navigating around via a fixed representation (SOAP), REST allows for dynamic navigation based on the hypertext responses from the server.

## Category Theory

Now that we've determined that the Server addressing scheme is a semi-group and the Client addressing scheme is a monoid (since its a semigroup with identity), we have to establish a relationship between them.

In other words, we have to establish a functor from a monoid to a semi-group.

### Semigroup

A semigroup is simply a set of elements with an associative binary operation defined on them. If we were to add the additional requirement that the set contained an identity element (like 1 for multiplication), then it would be a full-on group, but there's not much room in a REST api for an identity element like this.

Keep in mind that the mathematical identity element is very different than the "self" element common in REST architectures. A mathematical identity element would be an element e that could be combined with any other element to produce the same element, which is trivially the empty string if we're talking about URIs, i.e. "" + e == e + "" == e.

Now the monoid under consideration is an empty element (the root URI) with restricted append operations. This restriction is important to keep the request format valid rather than simply combining all possible routes to the root URI.

```sh
$ git clone https://github.com/heroku/clojure-getting-started.git
$ cd clojure-getting-started
$ lein repl
user=> (require 'clojure-getting-started.web)
user=>(def server (clojure-getting-started.web/-main))
```

Your app should now be running on [localhost:5000](http://localhost:5000/).

## Deploying to Heroku

```sh
$ heroku create
$ git push heroku master
$ heroku open
```

## Documentation

For more information about using Clojure on Heroku, see these Dev Center articles:

- [Clojure on Heroku](https://devcenter.heroku.com/categories/clojure)

