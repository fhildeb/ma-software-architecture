.PHONY: dockerup dockerdown dockerclean

dockerup:
	docker-compose up -d

dockerdown:
	docker-compose down

dockerclean:
	docker kill $$(docker ps -q) || true
	docker rm $$(docker ps -a -q) || true
	docker rmi $$(docker images -q) || true