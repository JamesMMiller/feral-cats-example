# feral-cats-example

Example implementation with deployment via github actions and SAM cli of the feral cats http4s example provided in:
https://github.com/typelevel/feral/blob/main/examples/src/main/scala/feral/examples/Http4sLambda.scala

Example ApiGatewayProxyEventV2 that you can test with on AWS:
```
{
  "routeKey": "GET /foo",
  "rawPath": "/foo",
  "rawQueryString": "",
  "headers": {
  },
  "isBase64Encoded": false,
  "requestContext": {
    "http": {
      "method": "GET"
    }
  }
}
```
