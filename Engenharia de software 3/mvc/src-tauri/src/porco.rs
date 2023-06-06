use serde::Deserialize;

#[derive(Deserialize)]
pub struct Pigs {
    name: String,
    age: u32
}

#[tauri::command]
pub fn pig(pig: Pigs) -> String{
    format!("porco {} de {} anos de idade adicionado", pig.name, pig.age)
}