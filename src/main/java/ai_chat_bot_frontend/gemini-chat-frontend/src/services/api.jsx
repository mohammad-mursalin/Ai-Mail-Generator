import axios from "axios";

const API_URL = "http://localhost:8080/api/ai-chat";

export const fetchChatResponse = async (question) => {
    try {
        const response = await axios.post(API_URL, {question});
        return response.data;
    } catch (error) {
        console.error(error);
        throw error;
    }
}