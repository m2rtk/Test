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
    stage('test') {
      tools {
        maven 'Maven 3.5.3'
      }
      steps {
        sh 'mvn test'
      }
    }
    stage('package') {
      tools {
        maven 'Maven 3.5.3'
      }
      steps {
        sh 'mvn package -DskipTests=true'
      }
    }
  }
}
