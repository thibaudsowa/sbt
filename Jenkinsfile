node {
   def mvnHome
   stage('Preparation') { // for display purposes
      // Get some code from a GitHub repository
      git 'https://github.com/thibaudsowa/sbt.git'
      // Get the Maven tool.
      // ** NOTE: This 'M3' Maven tool must be configured
      // **       in the global configuration.           
      mvnHome = tool 'apache-maven-3.3.1'
   }
   stage('Build') {
      // Run the maven build
      sh "'${mvnHome}/bin/mvn' clean package -DskipTests"
   }
   stage('Test') {
      // Run the maven build
      sh "'${mvnHome}/bin/mvn' -Dmaven.test.failure.ignore test"
   }
   stage('TestReport') {
      junit '**/target/surefire-reports/TEST-*.xml'
      archive 'target/*.jar'
   }
   stage('Jacoco') {
      jacoco()
   }
   stage('Sonar') {
       withSonarQubeEnv {
            sh "'${mvnHome}/bin/mvn' org.sonarsource.scanner.maven:sonar-maven-plugin:3.2:sonar"
        }
   }
}