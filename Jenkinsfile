pipeline {
  agents any
  stages {
  stage('git check in')
  {
  steps{
   git 'https://github.com/ghalisai/header.git'
   echo 'checkin the code from git'
  }
  }
  stage('code compile')
  {
   steps{
   withMaven(maven:'maven_3.6.3')
   sh 'mvn clean compile'
   }
  }
  }



}