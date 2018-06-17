pipeline {
  agent any
  stages {
    stage('maven') {
      tools {
        maven 'Maven 3.5.3'
      }
      stages {
        stage('compile') {
          steps {
            sh 'mvn compile'
          }
        }
        stage('test') {
          steps {
            sh 'mvn test'
          }
        }
        stage('package') {
          steps {
            sh 'mvn package -DskipTests=true'
          }
        }
      }
    }
  }
}
