# feral-cats-example

Example implementation with deployment via github actions and serverless of the feral cats http4s example provided in:
https://github.com/typelevel/feral/blob/main/examples/src/main/scala/feral/examples/Http4sLambda.scala

Note: 
This is still a work in progress. Currently not able to get the joke endpoint to work.. getting a connection refused.

Example ApiGatewayProxyEventV2 that you can test with on AWS:
```
{
  "version": "2.0",
  "routeKey": "GET /foo",
  "rawPath": "/foo",
  "rawQueryString": "",
  "headers": {
    "accept": "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8",
    "accept-encoding": "gzip, deflate, br",
    "accept-language": "en-US,en;q=0.5",
    "connection": "keep-alive",
    "host": "example.com",
    "user-agent": "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/95.0.4638.69 Safari/537.36"
  },
  "isBase64Encoded": false,
  "requestContext": {
    "accountId": "123456789012",
    "apiId": "abcdefghij",
    "domainName": "example.com",
    "domainPrefix": "abcdefg",
    "http": {
      "method": "GET",
      "path": "/foo",
      "protocol": "HTTP/1.1",
      "sourceIp": "203.0.113.0",
      "userAgent": "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/95.0.4638.69 Safari/537.36"
    },
    "routeKey": "GET /foo",
    "stage": "prod",
    "time": "2023-03-11T14:23:37.025Z",
    "timeEpoch": 1647062617025
  }
}
```
