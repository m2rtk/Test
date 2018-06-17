pipeline {
  agent any
  stages {
    stage('compile') {
      tools {
        maven 'Maven 3.5.3'
      }
      steps {
        sh 'mvn compile'
      }
    }
    stage('compile') {
      tools {
        maven 'Maven 3.5.3'
      }
      steps {
        sh 'mvn test'
      }
    }
    stage('compile') {
      tools {
        maven 'Maven 3.5.3'
      }
      steps {
        sh 'mvn package -DskipTests=true'
      }
    }
  }
}
