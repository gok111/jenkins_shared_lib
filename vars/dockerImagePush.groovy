def call(String project, String ImageTag, String hubUser){
    withCredentials([usernamePassword(
            credentialsId: "docker",
            usernameVariable: "gok111",
            passwordVariable: "llaura111"
    )]) {
        sh "docker login -u '$gok111' -p '$llaura111'"
    }
    //sh "docker image push ${hubUser}/${project}:${ImageTag}"
    sh "docker image push ${gok111}/${demo1}:latest"   
}


// def call(String aws_account_id, String region, String ecr_repoName){
    
//     sh """
//      aws ecr get-login-password --region ${region} | docker login --username AWS --password-stdin ${aws_account_id}.dkr.ecr.${region}.amazonaws.com
//      docker push ${aws_account_id}.dkr.ecr.${region}.amazonaws.com/${ecr_repoName}:latest
//     """
// }
