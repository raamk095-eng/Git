def Unittest(){
stage('unit test ){
echo "start the unit test"
echo "mvn test"
sh 'mvn test'
echo " unit test success"
}
}
