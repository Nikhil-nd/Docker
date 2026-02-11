pipeline {
    agent any 
    stages{
        stage('Build Docker Image'){
            steps{
                sh 'docker build -t springboot-app:1.0 .'
            }
        }
        stage('run container'){
            steps{
                sh'''
                    docker rm -f springboot-container || true
                    docker run -d -p 8081:8080 --name springboot-container springboot-app:1.0

                '''
            }
        }
    }
}