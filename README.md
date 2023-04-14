# javaapptest
test Docker

# Docker images
docker build -t javaapptest:1 .

# Docker run
docker run --name javaapptestDocker -d -p 2000:2000 javaapptest:1

# Commande DOCKER
docker tag 9f1c33e4833a kamehoi/javaapptest:1
docker push kamehoi/javaapptest:1

# GIT
git add .
git commit -m "Init workflow "
git tag -a 0.0.2 -m "Init workflow 2"
git push
git push --tags