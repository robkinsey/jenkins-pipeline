pipeline {
    agent { docker { image 'maven:3.3.3' } }
    stages {
        stage('build') {
            steps {
                sh 'mvn --version'
                sh 'echo "fish"'
            }
        }
        stage('Test') {
            steps {
                sh 'echo "Tests complete"'
            }
        }
        stage('Deploy Woodstove') {
            steps {
                sh 'echo "Woodstove deployed."'
            }
        }
    }
}
