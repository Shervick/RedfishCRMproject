pipeline {
    agent any 
    stages {
        stage('Build') {
            steps {
                echo 'Bulding the App' 
            }
        }
        stage('Test') {
            steps {
                echo 'Testing the Application' 
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying the Application' 
            }
        }
    }
    post {
        always {
            emailext body: '', subject: 'Always Condition', to: 'shervick@gmail.com'
        }
        failure {
            emailext body: '', subject: 'Failed', to: 'shervick@gmail.com'
        }
    }
}
