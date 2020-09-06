## Demo - 3Scale API Management
### Import Products API from Openshift
- Make Service Discoverable
```
metadata:
  annotations:
    discovery.3scale.net/path: /products
    discovery.3scale.net/port: '8080'
    discovery.3scale.net/scheme: http
  labels:
    discovery.3scale.net: 'true'
```
- Create Application, Method and Mappings in 3Scale
- Publish API
