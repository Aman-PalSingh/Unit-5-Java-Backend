package com.Unit5.C2;

//public interface DataManager {
//    public void read();
//    public void write();
//
//}
// class DiskRealmManager implements DataManager{
//
//     @Override
//     public void read() {
//         System.out.println("DiskRealmManager");
//     }
//
//     @Override
//     public void write() {
//         System.out.println("Saving Into Realm");
//     }
//
// }
// class DiskCoreDataManager implements DataManager{
//
//     @Override
//     public void read() {
//         System.out.println("Reading DiskCoreDataManager");
//     }
//
//     @Override
//     public void write() {
//         System.out.println("Saving Into Realm");
//     }
// }
//
// class InMemoryRealManager implements DataManager{
//
//     @Override
//     public void read() {
//         System.out.println("Reading InMemoryRealManager");
//     }
//
//     @Override
//     public void write() {
//
//     }
// }

//


//It was Violating Interface Segregation Principle
interface Read{
    public void read();
}
interface  Write{
    public void write();
}

 class DiskRealmManager implements Read,Write{
     @Override
     public void read() {
         System.out.println("DiskRealmManager");
     }

     @Override
     public void write() {
         System.out.println("Saving Into Realm");
     }
 }
 class DiskCoreDataManager implements Read,Write{

     @Override
     public void read() {
         System.out.println("Reading DiskCoreDataManager");
     }

     @Override
     public void write() {
         System.out.println("Saving Into Realm");
     }
 }
 class InMemoryRealManager implements Read{

     @Override
     public void read() {
         System.out.println("Reading InMemoryRealManager");
     }

 }
