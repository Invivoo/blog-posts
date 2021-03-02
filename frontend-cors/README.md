# Introducing CORS

Here you'll find the code we use to illustrate our article on _Cross origin resource sharing_.

It consists of a small node JS server that implements the CORS protocol and serves a simple HTML file containing JavaScript code to interact with the server.


## Set up

In order to illustrate _cross_ origin interaction, we need to simulate two different _origins_ on our local machine. The easiest way to do that is to edit our `/etc/hosts` file and add two new lines pointing to our local host:

```
127.0.0.1       hosta
127.0.0.1       hostb
```


## Running the server

This node was tested with Node 14.

Simply run the following command to start the HTTP server on the port `7771`:

```bash
node server.js
```


## Accessing the web site

On a web browser, simply go to the website via the following addresses:

```
http://hosta:7771
http://hostb:7771
```

The exposed website will provide two links, one to do a `PUT` request to `hosta` and another to `hostb`. Open the Dev tools and explore the browser's behavior when clicking on each link via each address. 
