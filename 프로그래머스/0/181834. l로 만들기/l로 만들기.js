function solution(string){
   let result = '';
   for(i = 0 ; i< string.length; i++){
      if(string[i]<'l'){
         result += 'l'
      }else{
         result += string[i]
      }
   }
   return result
}