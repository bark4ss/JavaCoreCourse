package jsonmarshalling.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import jsonmarshalling.model.Car;
import jsonmarshalling.model.Comfort;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class JsonConverter<T> {

    private final ObjectMapper objectMapper = new ObjectMapper();

    public String convertObjToJson(T obj) throws IOException {
        return objectMapper.writeValueAsString(obj);
    }
    public String convertObjToJson(File file, T obj) throws IOException {
        objectMapper.writeValue(file, obj);
        return objectMapper.writeValueAsString(obj);
    }

    public String convertObjToJsonWithRoot(File file, T obj) throws IOException {
        objectMapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
        objectMapper.writeValue(file, obj);
        return objectMapper.writeValueAsString(obj);
    }

    public String convertObjArrayToJson(List<T> objArr) throws IOException {
        return objectMapper.writeValueAsString(objArr);
    }

    public String convertObjArrayToJson(File file, List<T> objArr) throws IOException {
        objectMapper.writeValue(file, objArr);
        return objectMapper.writeValueAsString(objArr);
    }

    public T convertJsonToObj(String json, Class<T> type) throws IOException {
        return objectMapper.readValue(json, type);
    }

    public T convertJsonToObj(File json, Class<T> type) throws IOException {
        return objectMapper.readValue(json, type);
    }

    public List<T> convertJsonToObjArr(String json) throws IOException {
        return objectMapper.readValue(json, new TypeReference<>() {
        });
    }

    public List<T> convertJsonToObjArr(File file) throws IOException {
        return objectMapper.readValue(file, new TypeReference<>() {
        });
    }

    public Map<String,Object> convertJsonToMap (File json) throws IOException {
        return objectMapper.readValue(json, new TypeReference<>() {
        });
    }

    public String getObjJsonNode (String json, String node) throws JsonProcessingException {
        JsonNode jsonNode = objectMapper.readTree(json);
        return jsonNode.get(node).asText();
    }
}
