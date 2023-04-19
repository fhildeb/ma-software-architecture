.PHONY: dockerup dockerdown dockerclean

dockerup:
	docker-compose -p kpr1 up -d

dockerdown:
	docker-compose -p kpr1 down

dockerclean:
	docker kill $$(docker ps -q) || true
	docker rm $$(docker ps -a -q) || true
	docker rmi $$(docker images -q) || true
