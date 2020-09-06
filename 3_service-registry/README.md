### Demo - Service Registry
- Upload **registry_artifacts** for REST and SOAP APIs to Service Registry
- Define data mappings in AtlasMap
- Use following for the Source and Target POJOs (Request)
```
io.swagger.client.model.DeviceRequest
org.example.s2.FulFillmentRequest
```
- Use following for the Source and Target POJOs (Response)
```
io.swagger.client.model.DeviceResponse
org.example.s2.FulFillmentResponse
```
- Deploy soap-fulfillment and rest-device to Openshift
```
mvn fabric8:deploy -Popenshift
mvn fabric8:deploy -Popenshift
```
- Verify Services are available
```
oc get pods
oc port-forward device-1-mz4xl 8080
curl http://localhost:8080/camel/api-docs
```
- Send a JSON request to rest-device
```
curl -X POST \
--header 'Content-Type: application/json' \
--header 'Accept: application/json' \
-d "
{
  \"callerId\": \"curl\",
  \"msisdn\": \"012345\",
  \"brand\": \"SmartphoneX\",
  \"model\": \"modelY\",
  \"color\": \"blue\",
  \"size\": \"6in\"
}" \
'http://localhost:8080/camel/device/ordernew'

```


 