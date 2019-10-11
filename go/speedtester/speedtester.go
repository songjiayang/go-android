package speedtester

import (
	"net/http"
	"time"
)

func Perform(url string) (int, error) {
	req, err := http.NewRequest(http.MethodGet, url, nil)
	if err != nil {
		return 0, err
	}

	startAt := time.Now()

	resp, err := http.DefaultClient.Do(req)
	coast := time.Now().Sub(startAt)
	if err != nil {
		return 0, err
	}
	defer resp.Body.Close()

	return int(coast / time.Millisecond), nil
}
