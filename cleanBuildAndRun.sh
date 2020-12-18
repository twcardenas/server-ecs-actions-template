mvn clean install -U
echo "Build Docker Image"
IMAGE_ID=$(sudo docker build . | awk '/Successfully built/{print $NF}')
echo "Run Container ${IMAGE_ID}"
sudo docker run --env-file=env.txt -p 8080:8080 $IMAGE_ID