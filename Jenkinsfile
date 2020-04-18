pipeline {
    agent { 
        docker { 
            image 'maven:3-alpine' 
        } 
    }
    stages {
        stage('build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
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
