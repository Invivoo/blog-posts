var http = require("http");
var fs = require("fs");

http
  .createServer((req, res) => {
    console.log(req.method, req.url);

    let corsHeaders  = {
      "Access-Control-Allow-Origin": "http://hosta:7771",
      "Access-Control-Allow-Methods": "OPTIONS, PUT, GET"
    };
    if (req.url === "/cors") {
      if (req.method === "GET") {
        res.end(fs.readFileSync("index.html"));
      } if (req.method === "POST") {
        res.writeHead(200, corsHeaders);
        res.write("Hello POST");
        res.end();
      } if (req.method === "PUT") {
        res.writeHead(200, corsHeaders);
        res.write("Hello PUT");
        res.end();
      } else if (req.method === "OPTIONS") {
        res.writeHead(204, corsHeaders);
        res.end();
      }
    }
  })
  .listen(7771, () => {});
