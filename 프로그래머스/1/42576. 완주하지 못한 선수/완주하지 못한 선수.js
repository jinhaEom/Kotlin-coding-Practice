function solution(participant, completion) {
    participant.sort()
    completion.sort()
    
    for(const i in participant){
        if(completion[i] !=participant[i]){
            return participant[i]
        }
    }
}