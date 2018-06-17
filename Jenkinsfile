pipeline {
  agent any
  stages {
    stage('compile') {
      tools {
        mvn 'Maven 3.5.3'
      }
      steps {
        sh 'mvn compile'
      }
    }
  }
}
