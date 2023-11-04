pipeline {
    agent any
    tools {
        maven 'maven_3_9_5'
    }
    stages {
        stage('Build Maven') {
            steps {
                checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/Mohamedben01/spring-jenkins-app']])
                sh 'mvn clean install'
            }
        }
        stage('Build Docker Image') {
            steps {
                 script {
                     sh 'docker build -t mohamed01ben/spring-jenkins-app .'
                 }
            }
        }
        stage('Docker Login And Push') {
            steps {
                withCredentials([string(credentialsId: 'dockerhub-pwd', variable: 'dockerhubpwd')]) {
                    sh 'docker login -u mohamed01ben -p ${dockerhubpwd}'
                }
                sh 'docker push mohamed01ben/spring-jenkins-app'
            }
        }
    }
    post {
        always {
           sh 'docker logout'
        }
    }
}