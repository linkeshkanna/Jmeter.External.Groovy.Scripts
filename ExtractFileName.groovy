String fullPath = vars.get("FlatFiles");
int index = fullPath.lastIndexOf("/");
String fileName = fullPath.substring(index + 1);
vars.put("FileName", fileName);