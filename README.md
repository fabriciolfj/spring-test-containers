# spring-test-containers

Para executar os testes:

```
docker run -it --rm -v $PWD:$PWD -w $PWD -v /var/run/docker.sock:/var/run/docker.sock gradle 
```
