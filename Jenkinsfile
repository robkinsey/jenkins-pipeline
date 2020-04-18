pipeline {
    agent { docker { image 'maven:3.3.3' } }
    stages {
        stage('build') {
            steps {
                sh 'echo "Build complete."'
            }
        }
        stage('Test') {
            steps {
                sh 'echo "Tests complete."'
            }
        }
        stage('Deploy') {
            steps {
                sh 'echo "Woodstove deployed."'
            }
        }
    }
}
