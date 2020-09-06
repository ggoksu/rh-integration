## Demo - Fuse Online Integration
### Insert some data into PostgreSQL
```
export POD_POSTGRESQL=$(oc get pods | grep syndesis-db | awk '{if ($3 == "Running"){print $1}}'')

oc exec -it $POD_POSTGRESQL -- bash -c 'psql -d sampledb -c "CREATE TABLE products(id serial PRIMARY KEY,name VARCHAR (50),org VARCHAR (50),version integer);"'

oc exec -it $POD_POSTGRESQL -- bash -c "psql -d sampledb -c \"INSERT INTO products(name, org, version) VALUES  ('Openshift', 'Red Hat', 1);\""
oc exec -it $POD_POSTGRESQL -- bash -c "psql -d sampledb -c \"INSERT INTO products(name, org, version) VALUES  ('Integration', 'Red Hat', 2);\""
oc exec -it $POD_POSTGRESQL -- bash -c "psql -d sampledb -c \"INSERT INTO products(name, org, version) VALUES  ('Fuse', 'Red Hat', 3);\""
oc exec -it $POD_POSTGRESQL -- bash -c "psql -d sampledb -c \"INSERT INTO products(name, org, version) VALUES  ('3Scale', 'Red Hat', 4);\""
oc exec -it $POD_POSTGRESQL -- bash -c "psql -d sampledb -c \"INSERT INTO products(name, org, version) VALUES  ('AMQ', 'Red Hat', 5);\""

oc exec -it $POD_POSTGRESQL -- bash -c "psql -d sampledb -c \"select * from products;\""
```

### Create Products API Integration in Fuse:
```
{
    "id": 0,
    "name": "Openshift",
    "org": "Red Hat",
    "version": 0
}
```

### **GET** /products
```
Invoke SQL -> select * from products
```

### **POST** /products
```
Invoke SQL -> INSERT INTO PRODUCTS(NAME,ORG,VERSION) VALUES(:#NAME,:#ORG,:#VERSION);
```