def CompileMethod() { 
    stage('Compile') {
        echo " maven clean compile started"
        sh 'mvn clean compile'
	echo "maven compile is successed"
    }
}
