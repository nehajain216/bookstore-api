pipeline {
    agent any
    triggers {
       pollSCM('*/3 * * * *')
    }
    stages {
        stage ('Build') {
            steps {
                sh './mvnw clean verify'
            }
            post {
                success {
                    junit 'target/surefire-reports/**/*.xml'
                }
            }
        }
    }
}