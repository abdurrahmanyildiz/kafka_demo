# Kafka Demo
This is the works that I have done for Apache Kafka.

The repository includes the only <b>spring boot part</b> for the kafka implementation. 
I mean this is a java project for kafka configurations (topics, producer, consumer configurations) and also listener implementation and the spring boot rest controller api(message controller).


If you want to use this structure you need to firstly download the kafka from: 
 <a href="https://www.apache.org/dyn/closer.cgi?path=/kafka/3.2.1/kafka_2.13-3.2.1.tgz" target="_blank">Download Apache Kafka</a>



Then navigate to <a href="https://kafka.apache.org/quickstart" target="_blank" >Kafka QuickStart</a> and follow the instructions for quick start.
Please dont forget and consider that I am working on <b>Windows</b> machine. 

For this useful youtube video:  <a href="https://www.youtube.com/watch?v=SqVfCyfCJqw" target="_blank">Amigoscode Youtube Channel</a>

# To Run
First open command prompt and go to the kafka folder and run zookeeper server start batch file with the properties and then run the kafka server start batch file with the properties file.

{your_kafka_folder_path}\bin\windows\zookeeper-server-start.bat {your_kafka_folder_path}\config\zookeeper.properties

{your_kafka_folder_path}\bin\windows\kafka-server-start.bat {your_kafka_folder_path}\config\server.properties

If you see kafka server is now available on bla bla and port in logs you can now run the spring boot side.


