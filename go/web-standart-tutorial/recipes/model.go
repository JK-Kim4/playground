package recipes

type Recipe struct {
	Name        string        `json:"name"`
	Ingredients []Ingredients `json:"ingredients"`
}

type Ingredients struct {
	Name string `json:"name"`
}
