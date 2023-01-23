pipeline {
    agent any 
    stages{
        stage("test"){
            steps{
                sh "javac ./src/com/Test/NewTest.java"
                sh "java ./src/com/Test/NewTest.class"
            }
        }
    }
}