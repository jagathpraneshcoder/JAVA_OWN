
var RandomizedCollection = function() {
    this.data = {};
    this.arr = [];
};

/** 
 * @param {number} val
 * @return {boolean}
 */
RandomizedCollection.prototype.insert = function(val) {

      if(!(val in this.data)){ 
          this.data[val] = [this.arr.length];
          this.arr.push(val);
          return true;
      }else{
          const item = this.data[val];
          item.push(this.arr.length);
          this.data[val] = item;
          this.arr.push(val);
          return false;
      }
     
};

/** 
 * @param {number} val
 * @return {boolean}
 */
RandomizedCollection.prototype.remove = function(val) {
     if(val in this.data){
     const item = this.data[val];
     const arrayIndex = item.pop();
     
     if(arrayIndex !== this.arr.length-1) {
     const arrayLastItem = this.arr[this.arr.length-1];
     this.arr[arrayIndex] = arrayLastItem; 
     const mapLast =   this.data[arrayLastItem];
        mapLast[mapLast.length-1] = arrayIndex;
        const soreted = mapLast.sort((a,b)=> a-b);
        this.data[arrayLastItem] = soreted;
     
     }
    
     this.arr.pop();
    

     if(item.length ===0){
         delete this.data[val];
     }
    return true;
    }
    return false;
};

/**
 * @return {number}
 */
RandomizedCollection.prototype.getRandom = function() {
    const randomIdx = Math.floor(Math.random()*this.arr.length);
    return this.arr[randomIdx];
};

/** 
 * Your RandomizedCollection object will be instantiated and called as such:
 * var obj = new RandomizedCollection()
 * var param_1 = obj.insert(val)
 * var param_2 = obj.remove(val)
 * var param_3 = obj.getRandom()
 */